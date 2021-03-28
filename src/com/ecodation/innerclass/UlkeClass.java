package com.ecodation.innerclass;

public class UlkeClass {

	private String ulkeId;
	private String ulkeAdi;
	private String ulkeKodu;

	// getter and setter
	public String getUlkeAdi() {
		return ulkeAdi;
	}

	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}

	public String getUlkeKodu() {
		return ulkeKodu;
	}

	public void setUlkeKodu(String ulkeKodu) {
		this.ulkeKodu = ulkeKodu;
	}

	public String getUlkeId() {
		return ulkeId;
	}

	public void setUlkeId(String ulkeId) {
		this.ulkeId = ulkeId;
	}

	// inner class
	public class SehirClass {
		private String sehirId;
		private String sehirAdi;
		private String sehirKodu;

		// getter and setter
		public String getSehirId() {
			return sehirId;
		}

		public void setSehirId(String sehirId) {
			this.sehirId = sehirId;
		}

		public String getSehirAdi() {
			return sehirAdi;
		}

		public void setSehirAdi(String sehirAdi) {
			this.sehirAdi = sehirAdi;
		}

		public String getSehirKodu() {
			return sehirKodu;
		}

		public void setSehirKodu(String sehirKodu) {
			this.sehirKodu = sehirKodu;
		}

		public class mahalleClass {
			private long mahalleId;
			private String mahalleAdi;
			private String mahalleKodu;

			public long getMahalleId() {
				return mahalleId;
			}

			public void setMahalleId(long mahalleId) {
				this.mahalleId = mahalleId;
			}

			public String getMahalleAdi() {
				return mahalleAdi;
			}

			public void setMahalleAdi(String mahalleAdi) {
				this.mahalleAdi = mahalleAdi;
			}

			public String getMahalleKodu() {
				return mahalleKodu;
			}

			public void setMahalleKodu(String mahalleKodu) {
				this.mahalleKodu = mahalleKodu;
			}

		}

	}

}
