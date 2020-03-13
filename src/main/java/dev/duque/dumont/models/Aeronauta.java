package dev.duque.dumont.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Aeronauta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private String nomeAeronauta;
	private Date dataDeNascimentoAeronauta = new Date();
	private UnidadeFederativa ufAeronauta;
	private String nacionalidadeAeronauta;
	private Sexo sexoAeronauta;
	private String passaporteAeronauta;
	private String rgAeronauta; //Considerar trocar
	private String orgaoEmissorRgAeronauta;
	private String cpfAeronauta;
	private String tituloDeEleitorAeronauta;
	private String zonaEleitoralAeronauta;
	private UnidadeFederativa ufTituloEleitorAeronauta;
	private String certificadoMilitarAeronauta;
	private String orgaoEmissaoCertificadoMilitarAeronauta;
//	private String categoriaCertificadoMilitar;
	private Escolaridade escolaridadeAeronauta;
	private String telefoneFixoAeronauta;
	private String telefoneCelularAeronauta;
	private String emailAeronauta;
	
	//---------------------------
	
	// Dados de Endereço
	
	private String cepEnderecoAeronaura;
	private String logradouroEnderecoAeronaura;
	private String complementoEnderecoAeronaura;
	private String numeroEnderecoAeronaura;
	private String bairroEnderecoAeronaura;
	private String cidadeEnderecoAeronaura;
	private UnidadeFederativa ufEnderecoAeronaura;
	
	//---------------------------
	
	// Dados Anac
	
	private String codigoAnacAeronauta;
	private ChtAnac certificadoDeHabilitacaoTecnicaAeronauta;
	private HabilitacaoAnac habilitacaoAeronauta;
	private String numeroLicencaAeroauta;
	private Date dataEmissaoNumeroLicencaAeroauta = new Date();
	private Date dataValidadeNumeroLicencaAeroauta = new Date();
	private int nivelIcaoAeronauta;
	private CertificadoMedico classeCertificadoMedico;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeAeronauta() {
		return nomeAeronauta;
	}
	public void setNomeAeronauta(String nomeAeronauta) {
		this.nomeAeronauta = nomeAeronauta;
	}
	public Date getDataDeNascimentoAeronauta() {
		return dataDeNascimentoAeronauta;
	}
	public void setDataDeNascimentoAeronauta(Date dataDeNascimentoAeronauta) {
		this.dataDeNascimentoAeronauta = dataDeNascimentoAeronauta;
	}
	public UnidadeFederativa getUfAeronauta() {
		return ufAeronauta;
	}
	public void setUfAeronauta(UnidadeFederativa ufAeronauta) {
		this.ufAeronauta = ufAeronauta;
	}
	public String getNacionalidadeAeronauta() {
		return nacionalidadeAeronauta;
	}
	public void setNacionalidadeAeronauta(String nacionalidadeAeronauta) {
		this.nacionalidadeAeronauta = nacionalidadeAeronauta;
	}
	public Sexo getSexoAeronauta() {
		return sexoAeronauta;
	}
	public void setSexoAeronauta(Sexo sexoAeronauta) {
		this.sexoAeronauta = sexoAeronauta;
	}
	public String getPassaporteAeronauta() {
		return passaporteAeronauta;
	}
	public void setPassaporteAeronauta(String passaporteAeronauta) {
		this.passaporteAeronauta = passaporteAeronauta;
	}
	public String getRgAeronauta() {
		return rgAeronauta;
	}
	public void setRgAeronauta(String rgAeronauta) {
		this.rgAeronauta = rgAeronauta;
	}
	public String getOrgaoEmissorRgAeronauta() {
		return orgaoEmissorRgAeronauta;
	}
	public void setOrgaoEmissorRgAeronauta(String orgaoEmissorRgAeronauta) {
		this.orgaoEmissorRgAeronauta = orgaoEmissorRgAeronauta;
	}
	public String getCpfAeronauta() {
		return cpfAeronauta;
	}
	public void setCpfAeronauta(String cpfAeronauta) {
		this.cpfAeronauta = cpfAeronauta;
	}
	public String getTituloDeEleitorAeronauta() {
		return tituloDeEleitorAeronauta;
	}
	public void setTituloDeEleitorAeronauta(String tituloDeEleitorAeronauta) {
		this.tituloDeEleitorAeronauta = tituloDeEleitorAeronauta;
	}
	public String getZonaEleitoralAeronauta() {
		return zonaEleitoralAeronauta;
	}
	public void setZonaEleitoralAeronauta(String zonaEleitoralAeronauta) {
		this.zonaEleitoralAeronauta = zonaEleitoralAeronauta;
	}
	public UnidadeFederativa getUfTituloEleitorAeronauta() {
		return ufTituloEleitorAeronauta;
	}
	public void setUfTituloEleitorAeronauta(UnidadeFederativa ufTituloEleitorAeronauta) {
		this.ufTituloEleitorAeronauta = ufTituloEleitorAeronauta;
	}
	public String getCertificadoMilitarAeronauta() {
		return certificadoMilitarAeronauta;
	}
	public void setCertificadoMilitarAeronauta(String certificadoMilitarAeronauta) {
		this.certificadoMilitarAeronauta = certificadoMilitarAeronauta;
	}
	public String getOrgaoEmissaoCertificadoMilitarAeronauta() {
		return orgaoEmissaoCertificadoMilitarAeronauta;
	}
	public void setOrgaoEmissaoCertificadoMilitarAeronauta(String orgaoEmissaoCertificadoMilitarAeronauta) {
		this.orgaoEmissaoCertificadoMilitarAeronauta = orgaoEmissaoCertificadoMilitarAeronauta;
	}
	public Escolaridade getEscolaridadeAeronauta() {
		return escolaridadeAeronauta;
	}
	public void setEscolaridadeAeronauta(Escolaridade escolaridadeAeronauta) {
		this.escolaridadeAeronauta = escolaridadeAeronauta;
	}
	public String getTelefoneFixoAeronauta() {
		return telefoneFixoAeronauta;
	}
	public void setTelefoneFixoAeronauta(String telefoneFixoAeronauta) {
		this.telefoneFixoAeronauta = telefoneFixoAeronauta;
	}
	public String getTelefoneCelularAeronauta() {
		return telefoneCelularAeronauta;
	}
	public void setTelefoneCelularAeronauta(String telefoneCelularAeronauta) {
		this.telefoneCelularAeronauta = telefoneCelularAeronauta;
	}
	public String getEmailAeronauta() {
		return emailAeronauta;
	}
	public void setEmailAeronauta(String emailAeronauta) {
		this.emailAeronauta = emailAeronauta;
	}
	public String getCepEnderecoAeronaura() {
		return cepEnderecoAeronaura;
	}
	public void setCepEnderecoAeronaura(String cepEnderecoAeronaura) {
		this.cepEnderecoAeronaura = cepEnderecoAeronaura;
	}
	public String getLogradouroEnderecoAeronaura() {
		return logradouroEnderecoAeronaura;
	}
	public void setLogradouroEnderecoAeronaura(String logradouroEnderecoAeronaura) {
		this.logradouroEnderecoAeronaura = logradouroEnderecoAeronaura;
	}
	public String getComplementoEnderecoAeronaura() {
		return complementoEnderecoAeronaura;
	}
	public void setComplementoEnderecoAeronaura(String complementoEnderecoAeronaura) {
		this.complementoEnderecoAeronaura = complementoEnderecoAeronaura;
	}
	public String getNumeroEnderecoAeronaura() {
		return numeroEnderecoAeronaura;
	}
	public void setNumeroEnderecoAeronaura(String numeroEnderecoAeronaura) {
		this.numeroEnderecoAeronaura = numeroEnderecoAeronaura;
	}
	public String getBairroEnderecoAeronaura() {
		return bairroEnderecoAeronaura;
	}
	public void setBairroEnderecoAeronaura(String bairroEnderecoAeronaura) {
		this.bairroEnderecoAeronaura = bairroEnderecoAeronaura;
	}
	public String getCidadeEnderecoAeronaura() {
		return cidadeEnderecoAeronaura;
	}
	public void setCidadeEnderecoAeronaura(String cidadeEnderecoAeronaura) {
		this.cidadeEnderecoAeronaura = cidadeEnderecoAeronaura;
	}
	public UnidadeFederativa getUfEnderecoAeronaura() {
		return ufEnderecoAeronaura;
	}
	public void setUfEnderecoAeronaura(UnidadeFederativa ufEnderecoAeronaura) {
		this.ufEnderecoAeronaura = ufEnderecoAeronaura;
	}
	public String getCodigoAnacAeronauta() {
		return codigoAnacAeronauta;
	}
	public void setCodigoAnacAeronauta(String codigoAnacAeronauta) {
		this.codigoAnacAeronauta = codigoAnacAeronauta;
	}
	public ChtAnac getCertificadoDeHabilitacaoTecnicaAeronauta() {
		return certificadoDeHabilitacaoTecnicaAeronauta;
	}
	public void setCertificadoDeHabilitacaoTecnicaAeronauta(ChtAnac certificadoDeHabilitacaoTecnicaAeronauta) {
		this.certificadoDeHabilitacaoTecnicaAeronauta = certificadoDeHabilitacaoTecnicaAeronauta;
	}
	public HabilitacaoAnac getHabilitacaoAeronauta() {
		return habilitacaoAeronauta;
	}
	public void setHabilitacaoAeronauta(HabilitacaoAnac habilitacaoAeronauta) {
		this.habilitacaoAeronauta = habilitacaoAeronauta;
	}
	public String getNumeroLicencaAeroauta() {
		return numeroLicencaAeroauta;
	}
	public void setNumeroLicencaAeroauta(String numeroLicencaAeroauta) {
		this.numeroLicencaAeroauta = numeroLicencaAeroauta;
	}
	public Date getDataEmissaoNumeroLicencaAeroauta() {
		return dataEmissaoNumeroLicencaAeroauta;
	}
	public void setDataEmissaoNumeroLicencaAeroauta(Date dataEmissaoNumeroLicencaAeroauta) {
		this.dataEmissaoNumeroLicencaAeroauta = dataEmissaoNumeroLicencaAeroauta;
	}
	public Date getDataValidadeNumeroLicencaAeroauta() {
		return dataValidadeNumeroLicencaAeroauta;
	}
	public void setDataValidadeNumeroLicencaAeroauta(Date dataValidadeNumeroLicencaAeroauta) {
		this.dataValidadeNumeroLicencaAeroauta = dataValidadeNumeroLicencaAeroauta;
	}
	public int getNivelIcaoAeronauta() {
		return nivelIcaoAeronauta;
	}
	public void setNivelIcaoAeronauta(int nivelIcaoAeronauta) {
		this.nivelIcaoAeronauta = nivelIcaoAeronauta;
	}
	public CertificadoMedico getClasseCertificadoMedico() {
		return classeCertificadoMedico;
	}
	public void setClasseCertificadoMedico(CertificadoMedico classeCertificadoMedico) {
		this.classeCertificadoMedico = classeCertificadoMedico;
	}
	
	
	
	
	
	
	
	
	
}
