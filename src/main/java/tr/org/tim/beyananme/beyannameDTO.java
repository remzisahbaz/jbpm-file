package tr.org.tim.beyananme;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.xml.bind.annotation.XmlRootElement
public class beyannameDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "BEYANNAME_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "BEYANNAME_ID_GENERATOR", sequenceName = "BEYANNAME_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("GTIP")
	private java.lang.String gtip;

	@org.kie.api.definition.type.Label("Durum")
	private java.lang.String durum;

	@org.kie.api.definition.type.Label("Net Miktar")
	private double netmiktar;

	@org.kie.api.definition.type.Label(value = "Hata algılandı mı?")
	private java.lang.Boolean hata;

	public beyannameDTO() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getGtip() {
		return this.gtip;
	}

	public void setGtip(java.lang.String gtip) {
		this.gtip = gtip;
	}

	public java.lang.String getDurum() {
		return this.durum;
	}

	public void setDurum(java.lang.String durum) {
		this.durum = durum;
	}

	public double getNetmiktar() {
		return this.netmiktar;
	}

	public void setNetmiktar(double netmiktar) {
		this.netmiktar = netmiktar;
	}

	public java.lang.Boolean getHata() {
		return this.hata;
	}

	public void setHata(java.lang.Boolean hata) {
		this.hata = hata;
	}

	public beyannameDTO(java.lang.Long id, java.lang.String gtip,
			java.lang.String durum, double netmiktar, java.lang.Boolean hata) {
		this.id = id;
		this.gtip = gtip;
		this.durum = durum;
		this.netmiktar = netmiktar;
		this.hata = hata;
	}

}