package com.example.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {
    @Autowired
    private DeveloperRepository employeeRepository;
    @GetMapping(path="/developers")
    public List<Developer> getAllUsers(){
        return employeeRepository.findAll();
    }
    @GetMapping(path="/developers/{id}")
    Developer getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id)
                .orElseThrow(()->new DeveloperNotFoundException(id));
    }
    @PostMapping(path="/developers")
    public String  newEmployee(@RequestBody Developer dev){
        employeeRepository.save(dev);
        return "Developer is created succesfully";
    }
    @PutMapping(path="/developers/{id}")
    public String replaceEmployee(@RequestBody Developer newEmployee, @PathVariable Long id) throws DeveloperNotFoundException {
        Developer dev= employeeRepository.findById(id)
                .orElseThrow(()->new DeveloperNotFoundException(id));
        dev.setName(newEmployee.getName());
        dev.setSkills(newEmployee.getSkills());
        employeeRepository.save(dev);
        return "Developer is updated succesfully";
    }
    @DeleteMapping(path="/developers/{id}")
    public String deleteEmployee(@PathVariable Long id) throws DeveloperNotFoundException {
        Developer dev= employeeRepository.findById(id).orElseThrow(()->new DeveloperNotFoundException(id));
        employeeRepository.delete(dev);
        return "Developer is deleted succesfully";
    }
}
