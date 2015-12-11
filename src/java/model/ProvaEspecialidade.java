package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

// @author tavarerc

@Entity
public class ProvaEspecialidade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Membro membro;
    @ManyToOne
    private Especialidade especialidade;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAvaliação;
    @ManyToOne
    private Membro instrutor;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Date getDataAvaliação() {
        return dataAvaliação;
    }

    public void setDataAvaliação(Date dataAvaliação) {
        this.dataAvaliação = dataAvaliação;
    }

    public Membro getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Membro instrutor) {
        this.instrutor = instrutor;
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
        if (!(object instanceof ProvaEspecialidade)) {
            return false;
        }
        ProvaEspecialidade other = (ProvaEspecialidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ProvaEspecialidade[ id=" + id + " ]";
    }
}
