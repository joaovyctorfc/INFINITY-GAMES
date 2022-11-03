
package DTO;


public class UsuarioDTO {
    private String nome,email,senha,seg; 

    
   public String getNome() {
   return nome;
    }
   
   public String setNome() {
   return nome;
    }
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String getSeg() {
        return seg;
    }

   
    public void setSeg(String seg) {
        this.seg = seg;
    }
}
