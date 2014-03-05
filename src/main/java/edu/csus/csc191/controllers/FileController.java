package edu.csus.csc191.controllers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles file-related requests.
 */
@Controller
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired ServletContext context;

    /**
     * Handle file uploads.
     *
     * @param myFile The file being uploaded.
     * @param model The model associated with files.
     * @return Returns the name of the view that should generate the response content.
     *
     * @throws IOException
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @Secured("ROLE_ADMIN")
        public String upload(@RequestParam("myFile") MultipartFile myFile, Model model) throws IOException {

            String fileName = "";
            String path = "";
            BufferedOutputStream bos =null;
            if ( // If we're uploading a CSV or XML file.
                myFile != null
                && (myFile.getContentType().equals("application/vnd.ms-excel")// For some reasons Windows sees csv file type as application/vnd.ms-excel
                || myFile.getContentType().equals("text/xml")
                || myFile.getContentType().equals("text/csv"))
            ) {
                try {// if xml then save it to xml folder
                	if(myFile.getContentType().equals("text/xml")){
                		byte[] bytes = myFile.getBytes();
                        String username= SecurityContextHolder.getContext().getAuthentication().getName();
                        path=context.getRealPath("/resources/xml/")+File.separator+username;
                        fileName = myFile.getOriginalFilename();
                        new File(path).mkdir();//create a folder based on username

                        path=path+File.separator+fileName;
                        bos = new BufferedOutputStream(new FileOutputStream(path));
                        bos.write(bytes);
                        bos.close();    
                        model.addAttribute("message", "Your xml is uploaded to:"+path);
                        return "upload";
                		
                	}else{//save to resources folder
                		byte[] bytes = myFile.getBytes();
                        fileName = myFile.getOriginalFilename();
                        path=context.getRealPath("/resources")+File.separator+fileName;
                        bos = new BufferedOutputStream(new FileOutputStream(path));
                        bos.write(bytes);
                        bos.close();    
                        fileName=fileName.substring(0,fileName.length()-4);
                        
                        return "redirect:/cleanCSV/"+fileName;
                	}
                    
                	 
                     
                } catch (IOException e) {
                    // e.printStackTrace();
                    model.addAttribute("message", "Something is wrong, controller can not write file to server's file system !");
                    return "upload";

                }

            } else { // otherwise reject the file.
                model.addAttribute("message", "Your file type is " + myFile.getContentType() + ". Only  XML, or CSV files allowed.");
                return "upload";
            }
            
       

        }

    /**THESE ARE JUST EXPERIMENTAL METHODS
     * Retrieve XML file from server.NOT YET IMPLEMENTED
     *
     * @param fileName The file to retrieve.
     * @param model The model associated with files.
     * @return Returns the name of the view that should generate the response content.
     */
    @RequestMapping(value = "/getXmlOnServer/{fileName}", method = RequestMethod.GET)
    public String getXmlOnServer(@PathVariable("fileName") String fileName,Model model) {

    	try {
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream(context.getRealPath("/resources/xml/"+fileName+".xml"))
            );
            model.addAttribute("message", "Read xml from server successfully!");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            model.addAttribute("message", "Read xml from server unsuccessfully!");
            return "upload";
        }
        return "upload";
    }

    /**
     * Put XML file on server. NOT YET IMPLEMENTED
     *
     * @param fileName
     * @param model The model associated with files.
     * @return Returns the name of the view that should generate the response content.
     */
    @RequestMapping(value = "/putXmlOnServer/{fileName}", method = RequestMethod.GET)
        public String putXmlOnServer(@PathVariable("fileName") String fileName, Model model) {

            // Write the XML file to disk.
            try {
                byte[] bytes = new byte[10];

                String username= SecurityContextHolder.getContext().getAuthentication().getName();

                BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream(context.getRealPath("/resources/xml") + "/"+username+"-"+fileName+".xml")
                );
                bos.write(bytes);
                bos.close();
                model.addAttribute("message", "Write xml to server successfully!");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                model.addAttribute("message", "Write xml to server unsuccessfully!");
                return "upload";
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return "upload";
        }


    static {
        System.out.println(" -- Initializing FileController.");
    }
}
