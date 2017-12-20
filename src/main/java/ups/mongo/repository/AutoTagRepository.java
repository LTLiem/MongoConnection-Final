package ups.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ups.mongo.model.AutoTagOutput;

@Repository
public interface AutoTagRepository extends MongoRepository<AutoTagOutput, String> {
	
	public List<AutoTagOutput> findByReportId(String reportId);

	public List<AutoTagOutput> findByReportIdAndReportingDate(String reportId, String reportingDate);
}
