package ups.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ups.mongo.model.ReconOutput;

@Repository
public interface ReconOutputRepository extends MongoRepository<ReconOutput, String> {
	
	public List<ReconOutput> findByReportId(String reportId);

	public List<ReconOutput> findByReportIdAndReportingDate(String reportId, String reportingDate);
}
