
package DTO;


public class UsuarioDTO {
    private String nome,email,senha,seg; 
    private int id;
    private byte[] imagem;
    private String codigo,jogo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    
   public String getNome() {
   return nome;
    }
   
   public void setNome(String nome) {
      this.nome = nome;
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

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
