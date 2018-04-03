package ro.deroude.springjpatraining.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author valentin.raduti
 */
@Entity
public class User {

    public static final String ROLE_EDITOR = "editor", ROLE_ADMIN = "admin";
    public static final String STATUS_ACTIVE = "active", STATUS_INACTIVE = "inactive";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic(optional = false)
    private String username;

    @Basic(optional = false)
    private String name;

    @Basic(optional = false)
    private String role;

    @JsonIgnore
    @Basic(optional = false)
    private String password;

    @Basic(optional = false)
    private String status;

    @OneToMany(mappedBy = "author")
    private List<Article> articles = new LinkedList<>();

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @JsonIgnore
    public List<Article> getArticles() {
	return articles;
    }

    public void setArticles(List<Article> articles) {
	this.articles = articles;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
