package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.UploadInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadServiceRepo extends JpaRepository<UploadInfo, Integer> {

}
