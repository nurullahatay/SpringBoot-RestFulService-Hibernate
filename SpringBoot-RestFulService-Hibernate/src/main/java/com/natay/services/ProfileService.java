package com.natay.services;

import com.natay.model.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public interface ProfileService {


    public Iterable<Profile> getAllProfiles();

    public Profile getProfile(long id);

    public void addProfile(Profile profile);

    public void updateProfile(long id, Profile profile);

    public void deleteProfile(long id);
}
