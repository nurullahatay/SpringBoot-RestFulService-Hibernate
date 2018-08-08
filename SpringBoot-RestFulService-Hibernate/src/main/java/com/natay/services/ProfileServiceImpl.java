package com.natay.services;

import com.natay.model.Profile;
import com.natay.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {


    @Autowired
    private ProfileRepository profileRepository;


        public List<Profile> getAllProfiles() {
            return (List<Profile>) profileRepository.findAll();
        }
        public Profile getProfile(long id){
            Optional<Profile> profile = profileRepository.findById(id);
            return profile.get();

            /* for ( Profile profile : profiles){
                if (profile.getId()==id){
                    return profile;
                }
            }*/

        }

        public void addProfile(Profile profile){
            profileRepository.save(profile);
           // profiles.add(profile);
        }

        public void updateProfile(long id, Profile profile){
            Optional<Profile> studentOptional = profileRepository.findById(id);

            profile.setId(id);

            profileRepository.save(profile);

            /*for (int i=0; i<profiles.size(); i++){
                Profile profile1  = profiles.get(i);
                if (profile1.getId()==id){
                    profiles.set(i, profile);
                    return;
                }
            }*/
        }
        public void deleteProfile(long id){
            profileRepository.deleteById(id);

            /* for(int i=0; i<profiles.size(); i++){
                Profile profile = profiles.get(i);
                if(profile.getId()==id){
                    profiles.remove(i);
                    return;
                }
            }*/
        }


}
