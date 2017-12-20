package ups.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.mongo.model.AutoTagOutput;
import ups.mongo.repository.AutoTagRepository;
import ups.mongo.service.AutoTagService;

@Service(value = "AutoTagService")
public class AutoTagServiceImpl implements AutoTagService {

	@Autowired
	private AutoTagRepository autoTagRepository;

	public List<AutoTagOutput> getByReportId(String reportId) {
		return autoTagRepository.findByReportId(reportId);
	}

	public List<AutoTagOutput> getByReportIdAndReportingDate(String reportId, String reportingDate) {
		return autoTagRepository.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	public void saveToMongoDB(AutoTagOutput t) {
		autoTagRepository.save(t);
	}
	
}
