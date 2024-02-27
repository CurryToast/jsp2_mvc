package day6.mvc;

import java.util.Objects;

public class EqHashCodeTest {

	public static void main(String[] args) {
		RequestMap2 map1 = new RequestMap2("save", "GET");
		RequestMap2 map2 = new RequestMap2("save", "GET");
		
		System.out.println("map1 == map2 : " + (map1 == map2));
		System.out.println("map1.equals(map2) : " + map1.equals(map2));
	}

}

class RequestMap2 {
	private String url;
	private String method;
	
	public RequestMap2(String url, String method) {
		this.url = url;
		this.method = method;
	}

	public String getUrl() {
		return url;
	}
	public String getMethod() {
		return method;
	}

	@Override
	public int hashCode() {
		return Objects.hash(method, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestMap2 other = (RequestMap2) obj;
		return Objects.equals(method, other.method) && Objects.equals(url, other.url);
	}
}
