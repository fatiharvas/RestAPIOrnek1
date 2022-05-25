package com.medipol.yazilimaraclari.RestAPIOrnek1;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {

	private static List<Ogrenci> OGRENCILER = new ArrayList<>();
	
	@GetMapping("/listele")
	public List<Ogrenci> listele() {
		return OGRENCILER;
	}
	
	@PostMapping("/ekle")
	public String ekle(@RequestBody Ogrenci ogrenci) {
		OGRENCILER.add(ogrenci);
		return ogrenci.numara;
	}
	
	public record Ogrenci(String isim, String numara) {
		
	}
	
	/*
	public static class Ogrenci {
		
		private String isim;
		private String numara;
		
		public Ogrenci(String isim, String numara) {
			super();
			this.isim = isim;
			this.numara = numara;
		}
		
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public String getNumara() {
			return numara;
		}
		public void setNumara(String numara) {
			this.numara = numara;
		}
		
	}
	*/
	
	
}
