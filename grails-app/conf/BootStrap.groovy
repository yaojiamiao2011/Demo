//import org.projects.graduates.shiro.GradRealm;
//import org.apache.shiro.*;
import org.apache.shiro.crypto.hash.Sha512Hash
 //import org.icress.demo.shiro.Role
 //import org.icress.demo.shiro.User
 
class BootStrap {
/**
def init = { servletContext ->  
def user = new ShiroUser(username: "user", passwordHash: new Sha512Hash("user").toHex() ) 	 
user.save() 	 
def role= new ShiroRole(name:"admin").addToUsers(user).save() 		     
} 
**/
    def init = { servletContext ->
         def admin = new ShiroUser( username: "admin" ,  passwordHash: new Sha512Hash("admin").toHex()).save()
         def adminRole = new ShiroRole(name:"admin").addToUsers(admin).addToPermissions("*:*").save()
     }
 
    def destroy = {
    }
}
