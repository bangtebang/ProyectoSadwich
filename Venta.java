import java.util.Date;

public class Venta {
	private double totalVentas;
	private String idVenta;
	private Date fecha;

	public double getTotalVentas() {
		return this.totalVentas;
	}

	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}

	public String getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}