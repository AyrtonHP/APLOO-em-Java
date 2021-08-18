
package model;
 


public  class Conta {
    
    private String  nome;
    private int agencia;
    private int conta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public Conta(String nome, int agencia, int conta) {
        this.setNome(nome);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setSaldo(0);
    }  

    public void setNome(String nome) {
        if (nome.length() >=3) {
             this.nome = nome;
        } else{
            System.out.println("O nome precisa ter no minimo 3 caracteres");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar (double valor) {
        if (valor > 0) {
            this.setSaldo(this.saldo + valor);
        } else{
            System.out.println("O valor depositado não pode ser igual a 0");
            
        }
           
    }
    
}
