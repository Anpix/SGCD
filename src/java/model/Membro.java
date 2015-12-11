package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

// @author Anpix

@Entity
public class Membro implements Serializable {




    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    private Sexo sexo;
    private EstadoCivil estadocivil;
    private TipoSanguineo tipoSanguineo;
    @ManyToOne
    private Funcao funcao;
    
    //Identificação
    private Long cpf;
    private String rg_numero;
    private String rg_orgao;
    private String certidao;
    
    //Relacionamentos
    @OneToMany(mappedBy = "membro")
    private List<Email> emails;
    @OneToMany(mappedBy = "membro")
    private List<Endereco> enderecos;
    @OneToMany(mappedBy = "membro")
    private List<Telefone> telefones;
    @OneToMany(mappedBy = "membro")
    private List<ProvaEspecialidade> provasEspecialidades;
    @OneToMany(mappedBy = "instrutor")
    private List<ProvaEspecialidade> instrucaoEspecialidades;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo.toString();
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEstadocivil() {
        return estadocivil.toString();
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getRg_numero() {
        return rg_numero;
    }

    public void setRg_numero(String rg_numero) {
        this.rg_numero = rg_numero;
    }

    public String getRg_orgao() {
        return rg_orgao;
    }

    public void setRg_orgao(String rg_orgao) {
        this.rg_orgao = rg_orgao;
    }

    public String getCertidao() {
        return certidao;
    }

    public void setCertidao(String certidao) {
        this.certidao = certidao;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public List<ProvaEspecialidade> getProvasEspecialidades() {
        return provasEspecialidades;
    }

    public void setProvasEspecialidades(List<ProvaEspecialidade> provasEspecialidades) {
        this.provasEspecialidades = provasEspecialidades;
    }

    public List<ProvaEspecialidade> getInstrucaoEspecialidades() {
        return instrucaoEspecialidades;
    }

    public void setInstrucaoEspecialidades(List<ProvaEspecialidade> instrucaoEspecialidades) {
        this.instrucaoEspecialidades = instrucaoEspecialidades;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membro)) {
            return false;
        }
        Membro other = (Membro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pessoa[ id=" + id + " ]";
    }
    
}
