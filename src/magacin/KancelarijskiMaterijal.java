package magacin;

public class KancelarijskiMaterijal {
	private String nazivMaterijal;
	private int sifraMaterijal;
	private String opisMaterijal;
	private int kolicinaMaterijal;
	@Override
	public String toString() {
		return "KancelarijskiMaterijal [nazivMaterijal=" + nazivMaterijal + ", sifraMaterijal=" + sifraMaterijal
				+ ", opisMaterijal=" + opisMaterijal + ", kolicinaMaterijal=" + kolicinaMaterijal + "]";
	}
	public String getNazivMaterijal() {
		return nazivMaterijal;
	}
	public void setNazivMaterijal(String nazivMaterijal) {
		this.nazivMaterijal = nazivMaterijal;
	}
	public int getSifraMaterijal() {
		return sifraMaterijal;
	}
	public void setSifraMaterijal(int sifraMaterijal) {
		this.sifraMaterijal = sifraMaterijal;
	}
	public String getOpisMaterijal() {
		return opisMaterijal;
	}
	public void setOpisMaterijal(String opisMaterijal) {
		this.opisMaterijal = opisMaterijal;
	}
	public int getKolicinaMaterijal() {
		return kolicinaMaterijal;
	}
	public void setKolicinaMaterijal(int kolicinaMaterijal) {
		this.kolicinaMaterijal = kolicinaMaterijal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifraMaterijal;
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
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;
		if (sifraMaterijal != other.sifraMaterijal)
			return false;
		return true;
	}
	
	
}
