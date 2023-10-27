public class Pessoa; {
protected String nome;
protected String CPF;
protected String endereco;
protected String RG;
protected Date data_de_nascimento;

public Pessoa (String nome, String CPF, String endereco, String RG, Date data_de_nascimento);
    this.nome = nome;
    this.CPF =  CPF;
    this.endereco = endereco;
    this.RG = RG;
    this.data_de_nascimento = data_de_nascimento;
}

public String getnome(){
    return nome;
}

public void setnome(String nome)(){
    this.nome = nome;
}
public double tirarCopias(int qtd){
    return 0.15 * (double) qtd;
}

