package ups.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ups.mongo.model.ReconOutput;
import ups.mongo.repository.ReconOutputRepository;
import ups.mongo.service.ReconOutputService;

@Service(value = "ReconOutputService")
public class ReconOutputServiceImpl implements ReconOutputService {

	@Autowired
	private ReconOutputRepository reconOutputRepository;

	public List<ReconOutput> getByReportId(String reportId) {
		return reconOutputRepository.findByReportId(reportId);
	}

	public List<ReconOutput> getByReportIdAndReportingDate(String reportId, String reportingDate) {
		return reconOutputRepository.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	public void saveToMongoDB(ReconOutput t) {
		reconOutputRepository.save(t);
	}

}
