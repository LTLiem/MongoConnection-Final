package ups.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ups.mongo.model.ClusterOutput;
import ups.mongo.repository.ClusterOutputRepository;
import ups.mongo.service.ClusterOutputService;

@Service(value = "ClusterOutputService")
public class ClusterOutputServiceImpl implements ClusterOutputService {

	@Autowired
	private ClusterOutputRepository clusterOutputRepository;

	public List<ClusterOutput> getByReportId(String reportId) {
		return clusterOutputRepository.findByReportId(reportId);
	}

	public List<ClusterOutput> getByReportIdAndReportingDate(String reportId, String reportingDate) {
		return clusterOutputRepository.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	public void saveToMongoDB(ClusterOutput t) {
		clusterOutputRepository.save(t);
	}

}
