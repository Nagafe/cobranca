package edu.ifmt.cobranca.ifmt.model;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

// Imports atualizados de javax.* para jakarta.*
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // Uma entidade JPA
public class Titulo {

    @Id // identifica a Entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estratégia fica por conta do DB
    private Long codigo;

    private String descricao;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy") // formatação da data
    @Temporal(TemporalType.DATE) // só da data
    private Date dataVencimento;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING) // salvará no BD como String
    private StatusTitulo status;

    // Getters e Setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusTitulo getStatus() {
        return status;
    }

    public void setStatus(StatusTitulo status) {
        this.status = status;
    }

    // hashCode e equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Titulo other = (Titulo) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
}