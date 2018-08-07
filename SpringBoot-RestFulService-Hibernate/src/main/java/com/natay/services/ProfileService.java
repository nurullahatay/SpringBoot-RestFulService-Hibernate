package com.natay.services;

import com.natay.model.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProfileService {


    private List<Profile> profiles =new ArrayList<>( Arrays.asList(
            new Profile(1,"natay", "nurullah", "atay"),
            new Profile(2,"natay1", "nurullah1", "atay1"),
            new Profile(3,"natay2", "nurullah2", "atay2")
    ));

    public List<Profile> getAllProfiles() {
        return profiles;
    }

    public Profile getProfile(long id){
        for ( Profile profile : profiles){
            if (profile.getId()==id){
                return profile;
            }
        }
        return null;
    }

    public void addProfile(Profile profile){
        profiles.add(profile);
    }

    public void updateProfile(long id, Profile profile){
        for (int i=0; i<profiles.size(); i++){
             Profile profile1  = profiles.get(i);
            if (profile1.getId()==id){
                profiles.set(i, profile);
                return;
            }
        }
    }

    public void deleteProfile(long id){
        for(int i=0; i<profiles.size(); i++){
            Profile profile = profiles.get(i);
            if(profile.getId()==id){
                profiles.remove(i);
                return;
            }
        }
    }
}
