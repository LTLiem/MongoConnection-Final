package ups.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.mongo.model.ReconInputMx2;
import ups.mongo.repository.ReconInputRepositoryMx2;
import ups.mongo.service.ReconInputServiceMx2;

@Service(value = "ReconInputServiceMx2")
public class ReconInputServiceMx2Impl implements ReconInputServiceMx2 {

	@Autowired
	private ReconInputRepositoryMx2 reconInputRepositoryMx2;

	public List<ReconInputMx2> getByReportId(String reportId) {
		return reconInputRepositoryMx2.findByReportId(reportId);
	}

	public List<ReconInputMx2> getByReportIdAndReportingDate(String reportId, String reportingDate) {
		return reconInputRepositoryMx2.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	public void saveToMongoDB(ReconInputMx2 t) {
		reconInputRepositoryMx2.save(t);
	}

}
