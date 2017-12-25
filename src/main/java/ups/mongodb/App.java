package ups.mongodb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ups.mongo.configuration.SpringMongoConfig;
import ups.mongo.fileprocess.MongoDataUtil;
import ups.mongo.model.ReconInputMx2;
import ups.mongo.service.AutoTagService;
import ups.mongo.service.ClusterOutputService;
import ups.mongo.service.ReconInputServiceMx2;
import ups.mongo.service.ReconInputServiceMx3;
import ups.mongo.service.ReconOutputService;
import ups.mongo.service.impl.ClusterOutputServiceImpl;

public class App {

	public static void main(String[] args) throws ParseException {		
	
		//ClusterOutputService cService = MongoDataUtil.getClusterOutputService();				
		//System.out.println(cService.getByReportId("R320").get(0).getMergerRate());
		
		
		//AutoTagService aService = MongoDataUtil.getAutoTagService();				
		//System.out.println(aService.getByReportId("R111"));
		
		ReconInputServiceMx2 rec2Service = MongoDataUtil.getReconInputServiceMx2();				
		System.out.println(rec2Service.getByReportId("R320").get(0).getImportingTime());
		
		/*String tdate = "Wed Nov 08 09:53:24 ICT 2017";
		SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date pubDate = sdf.parse(tdate);
		System.out.println(pubDate);*/
		
		ReconInputServiceMx3 rec3Service = MongoDataUtil.getReconInputServiceMx3();				
		System.out.println(rec3Service.getByReportId("R320").get(0).getImportingTime());
		
		ReconInputMx2 mx2 = (ReconInputMx2) rec2Service.getByReportIdAndReportingDate("R320", "2017 Sep 20")
				.stream().filter(t -> "Thu Nov 09 14:38:17 ICT 2017".equals(t.getImportingTime().toString().trim()))
				.collect(Collectors.toList()).get(0);
		System.out.println(mx2.getReportingDate());
		//ReconOutputService outService = MongoDataUtil.getReconOutputService();				
		//System.out.println(outService.getByReportId("FXD10"));
		
	}
}
