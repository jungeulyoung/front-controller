package org.example.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.example.mvc.view.ModelAndView;

public class AnnotationHandler implements HandlerMapping{


    @Override
    public Object findHandler(HandlerKey handlerKey) {
        return null;
    }
}
