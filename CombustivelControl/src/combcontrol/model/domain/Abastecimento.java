package combcontrol.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="TB_ABASTECIMENTO")
public class Abastecimento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_ABASTECIMENTO")
	private Integer codigo;
	
	@Column(name="DT_ABASTECIMENTO")
	private String data;
	
	@Column(name="OD_ABASTECIMENTO")
	private String odometro;
	
	@Column(name="QT_ABASTECIMENTO")
	private double volume;
	
	@Column(name="VL_ABASTECIMENTO")
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="NR_VEICULO",referencedColumnName="NR_VEICULO")
	private Veiculo veiculo;

	public Abastecimento() {
	
	}

	public Abastecimento(Integer codigo, String data, String odometro,
			double volume, double valor, Veiculo veiculo) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.odometro = odometro;
		this.volume = volume;
		this.valor = valor;
		this.veiculo = veiculo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOdometro() {
		return odometro;
	}

	public void setOdometro(String odometro) {
		this.odometro = odometro;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

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
		Abastecimento other = (Abastecimento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	

}
