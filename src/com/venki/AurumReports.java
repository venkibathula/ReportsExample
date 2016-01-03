package com.venki;

import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
//started the program.

public class AurumReports {
	public static void main(String... args) throws JRException {
		try {
			System.out.println("Generating PDF...");
			JasperReport jasperReport = JasperCompileManager.compileReport("AurumReports.jrxml");
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(),
					new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(jasperPrint, "HelloJasper.pdf");

			System.out.println("HelloJasper.pdf has been generated!");
			System.out.println("HelloJasper.pdf has been generated by venki!");
			
		} catch (JRException e) {
			e.printStackTrace();
		}

	}
}// end of program.
	// this is branch.
	// contrioller.

}//end of program.
//this is branch.
//contrioller.
