package teamDev.backendreconnaissancefaciale.exception;

import org.springframework.context.annotation.ImportResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID=1L;
    public ResourceNotFoundException(String message){
        super(message);

    }
}
