package guru.springframework.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Interface <b>ImageService</b>.
 * @author Giancarlo
 */
public interface ImageService {

  void saveImageFile(Long recipeId, MultipartFile file);

}
