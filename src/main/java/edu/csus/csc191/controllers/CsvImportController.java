/*
 * Developed by Hoan Tran. 
 */
package edu.csus.csc191.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.postgresql.copy.CopyManager;
import org.postgresql.core.BaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.csus.csc191.hibernate.HibernateUtil;
import edu.csus.csc191.models.DynamicCsv;
import edu.csus.csc191.models.Mastercsv;
import au.com.bytecode.opencsv.CSVReader;

@Controller
public class CsvImportController {
	@Autowired
	ServletContext context;
	@Autowired
	DynamicCsv dcsv;
	@Autowired
	Mastercsv masterCsv;
	private static SessionFactory sessionFactory = HibernateUtil
			.getSessionFactory();

	@RequestMapping(value = "/importCsv", method = RequestMethod.GET)
	@Secured("ROLE_ADMIN")
	public String importCsv(Model model) {

		Connection c = null;
		long rows = 0;
		try {
			Resource resource = new ClassPathResource("csc191.properties");
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			String username = props.getProperty("dataSource.username");
			String password = props.getProperty("dataSource.password");
			String url = props.getProperty("dataSource.url");

			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection(url, username, password);
			// c=temp.getDataSource().getConnection();
			CopyManager copymanager = new CopyManager((BaseConnection) c);
			Statement stmt = c.createStatement();
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(
							context.getRealPath("/resources/dataset-withduplicates.csv")));
			ResultSet rs = stmt.executeQuery(" select deletetables()");
			rows = copymanager
					.copyIn("COPY tempmastercsv FROM STDIN WITH DELIMITER ',' CSV HEADER",
							bis);

			System.out.println(rows);

			rs = stmt.executeQuery(" select filterduplicates()");

			rs = stmt.executeQuery(" select populateclientstable()");
			rs.close();
			stmt.close();
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		
		int count= exportMasterCsvTableToCsvFile("dataset-withoutduplicates");
		model.addAttribute("message",rows + " rows were processed and "+(rows-count)+" duplicates removed");
		model.addAttribute("message1",count + " unique rows added successfully ");
		
		
		return "home";

	}

	public int exportMasterCsvTableToCsvFile(String fileName) {
		Session session = sessionFactory.openSession();
		String queryString = "select * from Mastercsv ";
		Query query = session.createSQLQuery(queryString);
		List results = query.list();
		StringBuilder line = new StringBuilder();
		int size = results.size();

		String path = context.getRealPath("/resources") + File.separator
				+fileName+ ".csv";
		try {
			FileWriter writer = new FileWriter(path);
			//hard coded headers for now
			writer.write("Support Data Version,UUID,Date Reported,HPICSM InstallDate,HPICSM Version,HPIC   Version,XP Count,P9000 Count,EVA Count,P2000 Count,P4000 Count,MSA Count,Cluster Count,Hosts Count,Datastores Count,VMs Count,Disk Count,3PAR Count,HPICSM Build,vCenter Count,vCenter Versions,ESX Versions (unique),Installed Module,StoreOnce Count,Initial Populate Time,Average Refresh Time,Create DS Count,Create DS Avg Time,Create DS Max Time,Create VM Count,Create VM Avg Time,Create VM Max Time,Clone VM Count,Clone VM Avg Time,Clone VM Max Time,Expand DS Count,Expand DS Avg Time,Expand DS Max Time,Delete DS Count,Delete DS Avg Time,Delete DS Max Time,Delete Vol Count,Delete Vol Avg Time,Delete Vol Max Time,Delete VM Count,Delete VM Avg Time,Delete VM Max Time,Monitor Header Count,Monitor Header Time,Monitor Footer Count,Monitor Footer Time,Header Health Count,Header Tasks Count,Actions Create DS Count,Actions Create VM Count,Actions Clone VM Count,Header Product Version Count,Header Host Properties Count,Header Comm Status Count,Header SAP Count,Header VASA URL Count,Header Reload Page Count,Header Refresh Cache,Host Monitor GS Count,Host Monitor GS Time,Host Monitor NewsFeed Count,Host Monitor NewsFeed Time,Host Monitor Health Count,Host Monitor Health Time,Host Monitor Tasks Count,Host Monitor Tasks Time,VM Monitor GS Count,VM Monitor GS Time,VM Monitor NewsFeed Count,VM Monitor NewsFeed Time,VM Monitor Health Count,VM Monitor Health Time,VM Monitor Tasks Count,VM Monitor Tasks Time,DS Monitor GS Count,DS Monitor GS Time,DS Monitor NewsFeed Count,DS Monitor NewsFeed Time,DS Monitor Health Count,DS Monitor Health Time,DS Monitor Tasks Count,DS Monitor Tasks Time,Cluster Monitor GS Count,Cluster Monitor GS Time,Cluster Monitor NewsFeed Count,Cluster Monitor NewsFeed Time,Cluster Monitor Health Count,Cluster Monitor Health Time,Cluster Monitor Tasks Count,Cluster Monitor Tasks Time,Host Manage GS Count,Host Manage GS Time,Host Manage Overview Count,Host Manage Overview Time,Host Manage Host Count,Host Manage Host Time,Host Manage Networking Count,Host Manage Networking Time,Host Manage Infrastructure Count,Host Manage Infrastructure Time,Host Manage FullSummary Count,Host Manage FullSummary Time,Host Manage BriefSummary Count,Host Manage BriefSummary Time,Host Manage Storage Count,Host Manage Storage Time,Host Manage SwFw Count,Host Manage SwFw Time,Host Manage StorageSummary Count,Host Manage StorageSummary Time,Host Manage StorageSVols Count,Host Manage StorageSVols Time,Host Manage StorageVDisks Count,Host Manage StorageVDisks Time,Host Manage StorageHBAs Count,Host Manage StorageHBAs Time,Host Manage StoragePaths Count,Host Manage StoragePaths Time,Host Manage StorageReplications Count,Host Manage StorageReplications Time,Host Manage StorageVM2Volumes Count,Host Manage StorageVM2Volumes Time,VM Manage GS Count,VM Manage GS Time,VM Manage Overview Count,VM Manage Overview Time,VM Manage Storage Count,VM Manage Storage Time,VM Manage SwFw Count,VM Manage SwFw Time,VM Manage StorageSummary Count,VM Manage StorageSummary Time,VM Manage StorageSVols Count,VM Manage StorageSVols Time,VM Manage StorageVDisks Count,VM Manage StorageVDisks Time,VM Manage StorageHBAs Count,VM Manage StorageHBAs Time,VM Manage StoragePaths Count,VM Manage StoragePaths Time,VM Manage StorageReplications Count,VM Manage StorageReplications Time,VM Manage StorageVM2Volumes Count,VM Manage StorageVM2Volumes Time,DS Manage GS Count,DS Manage GS Time,DS Manage Overview Count,DS Manage Overview Time,DS Manage Storage Count,DS Manage Storage Time,DS Manage SwFw Count,DS Manage SwFw Time,DS Manage StorageSummary Count,DS Manage StorageSummary Time,DS Manage StorageSVols Count,DS Manage StorageSVols Time,DS Manage StorageVDisks Count,DS Manage StorageVDisks Time,DS Manage StorageHBAs Count,DS Manage StorageHBAs Time,DS Manage StoragePaths Count,DS Manage StoragePaths Time,DS Manage StorageReplications Count,DS Manage StorageReplications Time,DS Manage StorageVM2Volumes Count,DS Manage StorageVM2Volumes Time,Cluster Manage GS Count,Cluster Manage GS Time,Cluster Manage Overview Count,Cluster Manage Overview Time,Cluster Manage Cluster Count,Cluster Manage Cluster Time,Cluster Manage Storage Count,Cluster Manage Storage Time,Cluster Manage SwFw Count,Cluster Manage SwFw Time,Cluster Manage Infrastructure Count,Cluster Manage Infrastructure Time,Cluster Manage StorageSummary Count,Cluster Manage StorageSummary Time,Cluster Manage StorageSVols Count,Cluster Manage StorageSVols Time,Cluster Manage StorageVDisks Count,Cluster Manage StorageVDisks Time,Cluster Manage StorageHBAs Count,Cluster Manage StorageHBAs Time,Cluster Manage StoragePaths Count,Cluster Manage StoragePaths Time,Cluster Manage StorageReplications Count,Cluster Manage StorageReplications Time,Cluster Manage StorageVM2Volumes Count,Cluster Manage StorageVM2Volumes Time,Create DS SuccessCount,Create VM SuccessCount,Clone VM SuccessCount,Expand DS SuccessCount,Delete DS SuccessCount,Create Vol SuccessCount,Delete Vm SuccessCount,Create DS FailureCount,Create VM FailureCount,Clone VM FailureCount,Expand DS FailureCount,Delete DS FailureCount,Create Vol FailureCount,Delete Vm FailureCount,VASA Registration Count,DAM All StorageCount,DAM All StorageTime,DAM System SummaryCount,DAM System SummaryTime,DAM Storage SummaryCount,DAM Storage SummaryTime,DAM System OverviewCount,DAM System OverviewTime,DAM HealthCount,DAM HealthTime,DAM LaunchLinksCount,DAM LaunchLinksTime,Servers,iLos,OAs,VCMs,ID\n");
			
			for (int i = 0; i < results.size(); i++) {// read each row
				Object[] arr = (Object[]) results.get(i);
				for (int j = 0; j < arr.length; j++) {//read each column in a row

					line.append('\"' + arr[j].toString() + '\"');
					if (j != arr.length - 1) {
						line.append(',');
					} else
						line.append('\n');

				}
				writer.write(line.toString());//write each row to CSV
				line = new StringBuilder();

			}

			
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return size;
		
	}

	@RequestMapping(value = "/cleanCSV/{fileName}", method = RequestMethod.GET)
	@Secured("ROLE_ADMIN")
	public String cleanCSV(Model model,
			@PathVariable("fileName") String fileName) throws IOException {

		String path = context.getRealPath("/resources") + File.separator
				+ "dataset-withduplicates.csv";
		FileWriter writer = new FileWriter(path);
		try {

			CSVReader reader = new CSVReader(new FileReader(
					context.getRealPath("/resources") + File.separator
							+ fileName + ".csv"));

			String[] nextLine;
			String regex = "\\w{8}[-]\\w{4}[-]\\w{4}[-]\\w{4}[-]\\w{12}";
			// String dateRegex =
			// "^([1-9]|0[1-9]|1[0-2])[- / .]([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])[- / .](1[9][0-9][0-9]|2[0][0-9][0-9])[\\s]([1-9]|1[0-9]|2[0-3])[:]([0-5]?[0-9])$";
			StringBuilder line = new StringBuilder();
			// nextLine = reader.readNext();

			while ((nextLine = reader.readNext()) != null) {
				// goes thru each cell in the current row
				for (int i = 0; i < nextLine.length; i++) {
					if (nextLine[i].equals("n/a") || nextLine[i].equals("")
							|| nextLine[i].equals("Unknown")
							|| nextLine[i].equalsIgnoreCase("null")
							|| nextLine[i].equalsIgnoreCase(","))
						nextLine[i] = "0";// fill cell with 0
					if ((i == 20 || i == 21 || i == 22)
							&& (nextLine[i].equals("0")))
						nextLine[i] = "";// these are vCenter, ESXVersion,
											// Installed Module. They can not
											// have numeric values

				}
				// write each line to csv
				for (int i = 0; i < nextLine.length; i++) {
					if (nextLine[1].matches(regex)
							|| nextLine[1].equals("UUID")) {
						line.append('\"' + nextLine[i] + '\"');
						if (i != nextLine.length - 1) {
							line.append(',');
						} else
							line.append('\n');

					}

				}

				writer.write(line.toString());
				line = new StringBuilder();
			}

			writer.close();
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("message", "File not found!");
			
			
		}
		model.addAttribute("message", "A CSV is saved to: " + path);
		model.addAttribute("message1", context.getContextPath());
		return "uploadConfirm";

	}

}
