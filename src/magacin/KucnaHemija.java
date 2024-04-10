package magacin;

import java.util.Date;

public class KucnaHemija {
	private String nazivHemija;
	private int sifraHemija;
	private String opisHemija;
	private int kolicinaHemija;
	private Date rokTrajanja;
	public String getNazivHemija() {
		return nazivHemija;
	}
	public void setNazivHemija(String nazivHemija) {
		this.nazivHemija = nazivHemija;
	}
	public int getSifraHemija() {
		return sifraHemija;
	}
	public void setSifraHemija(int sifraHemija) {
		this.sifraHemija = sifraHemija;
	}
	public String getOpisHemija() {
		return opisHemija;
	}
	public void setOpisHemija(String opisHemija) {
		this.opisHemija = opisHemija;
	}
	public int getKolicinaHemija() {
		return kolicinaHemija;
	}
	public void setKolicinaHemija(int kolicinaHemija) {
		this.kolicinaHemija = kolicinaHemija;
	}
	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	@Override
	public String toString() {
		return "KucnaHemija [nazivHemija=" + nazivHemija + ", sifraHemija=" + sifraHemija + ", opisHemija=" + opisHemija
				+ ", kolicinaHemija=" + kolicinaHemija + ", rokTrajanja=" + rokTrajanja + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifraHemija;
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
		KucnaHemija other = (KucnaHemija) obj;
		if (sifraHemija != other.sifraHemija)
			return false;
		return true;
	}
	
	
}
