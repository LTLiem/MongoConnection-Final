package ups.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.mongo.model.ReconInputMx3;
import ups.mongo.repository.ReconInputRepositoryMx3;
import ups.mongo.service.ReconInputServiceMx3;

@Service(value = "ReconInputServiceMx3")
public class ReconInputServiceMx3Impl implements ReconInputServiceMx3 {

	@Autowired
	private ReconInputRepositoryMx3 reconInputRepositoryMx3;

	public List<ReconInputMx3> getByReportId(String reportId) {
		return reconInputRepositoryMx3.findByReportId(reportId);
	}

	public List<ReconInputMx3> getByReportIdAndReportingDate(String reportId, String reportingDate) {
		return reconInputRepositoryMx3.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	public void saveToMongoDB(ReconInputMx3 t) {
		reconInputRepositoryMx3.save(t);
	}

}
