package maksim_ya.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name="role")
public class Role extends Model{
    private  static  final long serialVersionUID = 872357356473924L;

    @Column (name = "Id")
    private  Long id;

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();

    public  Role (){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<User> getUsers() {

        return users;
    }

    public Long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }
}
