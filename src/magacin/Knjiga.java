package magacin;

public class Knjiga {
	private String nazivKnjiga;
	private int sifraKnjiga;
	private String opisKnjiga;
	private int kolicinaKnjiga;
	public String getNazivKnjiga() {
		return nazivKnjiga;
	}
	public void setNazivKnjiga(String nazivKnjiga) {
		this.nazivKnjiga = nazivKnjiga;
	}
	public int getSifraKnjiga() {
		return sifraKnjiga;
	}
	public void setSifraKnjiga(int sifraKnjiga) {
		this.sifraKnjiga = sifraKnjiga;
	}
	public String getOpisKnjiga() {
		return opisKnjiga;
	}
	public void setOpisKnjiga(String opisKnjiga) {
		this.opisKnjiga = opisKnjiga;
	}
	public int getKolicinaKnjiga() {
		return kolicinaKnjiga;
	}
	public void setKolicinaKnjiga(int kolicinaKnjiga) {
		this.kolicinaKnjiga = kolicinaKnjiga;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifraKnjiga;
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
		Knjiga other = (Knjiga) obj;
		if (sifraKnjiga != other.sifraKnjiga)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Knjiga [nazivKnjiga=" + nazivKnjiga + ", sifraKnjiga=" + sifraKnjiga + ", opisKnjiga=" + opisKnjiga
				+ ", kolicinaKnjiga=" + kolicinaKnjiga + "]";
	}
	
	
}
