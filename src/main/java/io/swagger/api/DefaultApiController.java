package io.swagger.api;

import io.swagger.model.Recommendation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-12T13:45:36.790+08:00")

@Controller
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Recommendation> rootGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Recommendation>(objectMapper.readValue("{  \"features\" : \"features\",  \"img\" : \"img\",  \"images\" : [ \"images\", \"images\" ],  \"shipping\" : 0,  \"documents\" : \"documents\",  \"price\" : 6,  \"product_id\" : \"product_id\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"title\" : \"title\",  \"subCat\" : 1,  \"recommended\" : \"recommended\"}", Recommendation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Recommendation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Recommendation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Recommendation> rootPost(@ApiParam(value = ""  )  @Valid @RequestBody Recommendation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Recommendation>(objectMapper.readValue("{  \"features\" : \"features\",  \"img\" : \"img\",  \"images\" : [ \"images\", \"images\" ],  \"shipping\" : 0,  \"documents\" : \"documents\",  \"price\" : 6,  \"product_id\" : \"product_id\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"title\" : \"title\",  \"subCat\" : 1,  \"recommended\" : \"recommended\"}", Recommendation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Recommendation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Recommendation>(HttpStatus.NOT_IMPLEMENTED);
    }

}
