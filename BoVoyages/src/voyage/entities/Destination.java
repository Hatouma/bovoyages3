package voyage.entities;

/**
 * <b>Destination est une classe représentant la destination d'un voyage.</b>
 * <p>
 * Une destination est caractérisée par :
 * <ul>
 * <li>Un continent</li>
 * <li>Un pays</li>
 * <li>Une région</li>
 * <li>Une description</li>
 * </ul>
 * <p>
 * 
 * @author Adminl
 * @version 2.0
 *
 */
public class Destination {
	private int id;
	private String continent;
	private String pays;
	private String region;
	private String description;

	public Destination() {
		super();
	}

	public Destination(String continent, String pays, String region, String description) {
		super();
		this.continent = continent;
		this.pays = pays;
		this.region = region;
		this.description = description;
	}

	public String getContinent() {
		if (continent != null) {
			return new String(continent);
		}
		return null;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getPays() {
		if (pays != null) {
			return new String(pays);
		}
		return null;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getRegion() {
		if (region != null) {
			return new String(region);
		}
		return null;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescription() {
		if (description != null) {
			return new String(description);
		}
		return null;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		Destination other = (Destination) obj;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

}
