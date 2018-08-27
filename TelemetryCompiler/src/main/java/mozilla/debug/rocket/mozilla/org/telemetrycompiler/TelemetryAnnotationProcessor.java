package mozilla.debug.rocket.mozilla.org.telemetrycompiler;

import org.mozilla.components.telemetry.annotation.TelemetryDoc;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

public class TelemetryAnnotationProcessor extends AbstractProcessor {

    private Types typeUtils;

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> types = new LinkedHashSet<>();
        types.add(TelemetryDoc.class.getCanonicalName());
        return types;
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        typeUtils = processingEnv.getTypeUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        Collection<? extends Element> annotatedElements =
                env.getElementsAnnotatedWith(TelemetryDoc.class);

        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "----------------TelemetryAnnotationProcessor start----------------Found:" + annotatedElements.size());
        for (Element type : annotatedElements) {
            if (type.getKind() == ElementKind.METHOD) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "TelemetryWrapper Method Name " + type);
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "action:" + type.getAnnotation(TelemetryDoc.class).action());
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "method:" + type.getAnnotation(TelemetryDoc.class).method());
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "object:" + type.getAnnotation(TelemetryDoc.class).object());
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "value:" + type.getAnnotation(TelemetryDoc.class).value());
            } else {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "This should not happen:" + type);
            }
        }
        return false;
    }
}
