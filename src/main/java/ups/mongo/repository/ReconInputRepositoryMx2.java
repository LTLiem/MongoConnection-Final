package ups.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ups.mongo.model.ReconInputMx2;

@Repository
public interface ReconInputRepositoryMx2 extends MongoRepository<ReconInputMx2, String> {
	
	public List<ReconInputMx2> findByReportId(String reportId);

	public List<ReconInputMx2> findByReportIdAndReportingDate(String reportId, String reportingDate);
}
