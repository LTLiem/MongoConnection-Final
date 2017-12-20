package ups.mongo.fileprocess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ups.mongo.configuration.SpringMongoConfig;
import ups.mongo.service.AutoTagService;
import ups.mongo.service.ClusterOutputService;
import ups.mongo.service.ReconInputServiceMx2;
import ups.mongo.service.ReconInputServiceMx3;
import ups.mongo.service.ReconOutputService;
import ups.mongo.service.impl.AutoTagServiceImpl;
import ups.mongo.service.impl.ClusterOutputServiceImpl;
import ups.mongo.service.impl.ReconInputServiceMx2Impl;
import ups.mongo.service.impl.ReconInputServiceMx3Impl;
import ups.mongo.service.impl.ReconOutputServiceImpl;

public class MongoDataUtil {

	private static ApplicationContext ctx;

	protected static ApplicationContext getApplicationContext() {
		if (ctx == null) {
			ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		}
		return ctx;
	}

	public static AutoTagService getAutoTagService() {
		getApplicationContext();
		return ctx.getBean(AutoTagServiceImpl.class);
	}

	public static ClusterOutputService getClusterOutputService() {
		getApplicationContext();
		return ctx.getBean(ClusterOutputServiceImpl.class);
	}

	public static ReconInputServiceMx2 getReconInputServiceMx2() {
		getApplicationContext();
		return ctx.getBean(ReconInputServiceMx2Impl.class);
	}

	public static ReconInputServiceMx3 getReconInputServiceMx3() {
		getApplicationContext();
		return ctx.getBean(ReconInputServiceMx3Impl.class);
	}

	public static ReconOutputService getReconOutputService() {
		getApplicationContext();
		return ctx.getBean(ReconOutputServiceImpl.class);
	}
}
