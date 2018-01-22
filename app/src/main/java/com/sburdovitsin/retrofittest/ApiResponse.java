package com.sburdovitsin.retrofittest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ApiResponse {

	@SerializedName("Rod")
	@Expose
	private String rod;
	@SerializedName("Dav")
	@Expose
	private String dav;
	@SerializedName("Zn")
	@Expose
	private String zn;
	@SerializedName("Or")
	@Expose
	private String or;
	@SerializedName("Mis")
	@Expose
	private String mis;
	@SerializedName("Kl")
	@Expose
	private String kl;

	public String getRod() {
		return rod;
	}

	public void setRod(String rod) {
		this.rod = rod;
	}

	public String getDav() {
		return dav;
	}

	public void setDav(String dav) {
		this.dav = dav;
	}

	public String getZn() {
		return zn;
	}

	public void setZn(String zn) {
		this.zn = zn;
	}

	public String getOr() {
		return or;
	}

	public void setOr(String or) {
		this.or = or;
	}

	public String getMis() {
		return mis;
	}

	public void setMis(String mis) {
		this.mis = mis;
	}

	public String getKl() {
		return kl;
	}

	public void setKl(String kl) {
		this.kl = kl;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("rod", rod).append("dav", dav).append("zn", zn).append("or", or).append("mis", mis).append("kl", kl).toString();
	}

}
