package ups.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ups.mongo.model.ClusterOutput;

@Repository
public interface ClusterOutputRepository extends MongoRepository<ClusterOutput, String> {
	
	public List<ClusterOutput> findByReportId(String reportId);

	public List<ClusterOutput> findByReportIdAndReportingDate(String reportId, String reportingDate);
}
