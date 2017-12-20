package ups.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ups.mongo.model.ReconInputMx3;

@Repository
public interface ReconInputRepositoryMx3 extends MongoRepository<ReconInputMx3, String> {
	
	public List<ReconInputMx3> findByReportId(String reportId);

	public List<ReconInputMx3> findByReportIdAndReportingDate(String reportId, String reportingDate);
}
