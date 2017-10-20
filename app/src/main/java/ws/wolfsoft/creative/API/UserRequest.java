package ws.wolfsoft.creative.API;

import java.util.HashMap;

/**
 * Created by root on 20/10/17.
 */
public class UserRequest {
    private Long id;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String photoProfile;

    private String email;

    private HashMap<String,String> interests = new HashMap<>();

    private HashMap<String,String> jobs = new HashMap<>();

    private HashMap<String,String> photos = new HashMap<>();

    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoProfile() {
        return photoProfile;
    }

    public void setPhotoProfile(String photoProfile) {
        this.photoProfile = photoProfile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, String> getInterests() {
        return interests;
    }

    public void setInterests(HashMap<String, String> interests) {
        this.interests = interests;
    }

    public HashMap<String, String> getJobs() {
        return jobs;
    }

    public void setJobs(HashMap<String, String> jobs) {
        this.jobs = jobs;
    }

    public HashMap<String, String> getPhotos() {
        return photos;
    }

    public void setPhotos(HashMap<String, String> photos) {
        this.photos = photos;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
