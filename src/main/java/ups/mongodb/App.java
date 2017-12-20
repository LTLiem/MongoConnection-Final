package ups.mongodb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ups.mongo.configuration.SpringMongoConfig;
import ups.mongo.fileprocess.MongoDataUtil;
import ups.mongo.service.AutoTagService;
import ups.mongo.service.ClusterOutputService;
import ups.mongo.service.ReconInputServiceMx2;
import ups.mongo.service.ReconInputServiceMx3;
import ups.mongo.service.ReconOutputService;
import ups.mongo.service.impl.ClusterOutputServiceImpl;

public class App {

	public static void main(String[] args) {		
	
		ClusterOutputService cService = MongoDataUtil.getClusterOutputService();				
		System.out.println(cService.getByReportId("R330").get(0).getMergerRate());
		
		
		AutoTagService aService = MongoDataUtil.getAutoTagService();				
		System.out.println(aService.getByReportId("R111"));
		
		ReconInputServiceMx2 rec2Service = MongoDataUtil.getReconInputServiceMx2();				
		System.out.println(rec2Service.getByReportId("R111"));
		
		ReconInputServiceMx3 rec3Service = MongoDataUtil.getReconInputServiceMx3();				
		System.out.println(rec3Service.getByReportId("R320"));
		
		ReconOutputService outService = MongoDataUtil.getReconOutputService();				
		System.out.println(outService.getByReportId("FXD10"));
		
	}
}
