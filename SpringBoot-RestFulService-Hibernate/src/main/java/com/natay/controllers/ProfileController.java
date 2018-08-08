package com.natay.controllers;

import com.natay.model.Profile;
import com.natay.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping("/profiles")
    public List<Profile> getAllProfiles(){
        return (List<Profile>) profileService.getAllProfiles();
    }

    @RequestMapping("/profiles/{id}")
    public Profile getProfile(@PathVariable("id") long id){
        return profileService.getProfile(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/profiles")
    public void addProfile(@RequestBody Profile profile){
        profileService.addProfile(profile);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/profiles/{id}")
    public void updateProfile(@PathVariable("id") long id, @RequestBody Profile profile ){
        profileService.updateProfile(id, profile);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/profiles/{id}")
    public void deleteProfile(@PathVariable("id") long id){
        profileService.deleteProfile(id);
    }
}
