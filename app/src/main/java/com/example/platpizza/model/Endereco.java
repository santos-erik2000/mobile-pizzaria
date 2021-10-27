package com.example.platpizza.model;

public class Endereco {

    private Integer idEnderecoVM;
    private String cepEnderecoVM;
    private String ruaEnderecoVM;
    private Integer numeroEnderecoVM;
    private String complementoEnderecoVM;
    private String bairroEnderecoVM;
    private String cidadeEnderecoVM;

    public Integer getIdEnderecoVM() {
        return idEnderecoVM;
    }

    public void setIdEnderecoVM(Integer idEnderecoVM) {
        this.idEnderecoVM = idEnderecoVM;
    }

    public String getCepEnderecoVM() {
        return cepEnderecoVM;
    }

    public void setCepEnderecoVM(String cepEnderecoVM) {
        this.cepEnderecoVM = cepEnderecoVM;
    }

    public String getRuaEnderecoVM() {
        return ruaEnderecoVM;
    }

    public void setRuaEnderecoVM(String ruaEnderecoVM) {
        this.ruaEnderecoVM = ruaEnderecoVM;
    }

    public Integer getNumeroEnderecoVM() {
        return numeroEnderecoVM;
    }

    public void setNumeroEnderecoVM(Integer numeroEnderecoVM) {
        this.numeroEnderecoVM = numeroEnderecoVM;
    }

    public String getComplementoEnderecoVM() {
        return complementoEnderecoVM;
    }

    public void setComplementoEnderecoVM(String complementoEnderecoVM) {
        this.complementoEnderecoVM = complementoEnderecoVM;
    }

    public String getBairroEnderecoVM() {
        return bairroEnderecoVM;
    }

    public void setBairroEnderecoVM(String bairroEnderecoVM) {
        this.bairroEnderecoVM = bairroEnderecoVM;
    }

    public String getCidadeEnderecoVM() {
        return cidadeEnderecoVM;
    }

    public void setCidadeEnderecoVM(String cidadeEnderecoVM) {
        this.cidadeEnderecoVM = cidadeEnderecoVM;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "idEnderecoVM=" + idEnderecoVM +
                ", cepEnderecoVM='" + cepEnderecoVM + '\'' +
                ", ruaEnderecoVM='" + ruaEnderecoVM + '\'' +
                ", numeroEnderecoVM=" + numeroEnderecoVM +
                ", complementoEnderecoVM='" + complementoEnderecoVM + '\'' +
                ", bairroEnderecoVM='" + bairroEnderecoVM + '\'' +
                ", cidadeEnderecoVM='" + cidadeEnderecoVM + '\'' +
                '}';
    }
}
