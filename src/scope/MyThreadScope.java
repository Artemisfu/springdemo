package scope;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class MyThreadScope implements Scope {
    private final ThreadLocal<HashMap<String, Object>> myThreadScope = ThreadLocal.withInitial(() -> {
        System.out.println("initialize ThreadLocal");
        return new HashMap<>();
    });

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map<String, Object> scope = myThreadScope.get();
        System.out.println("getting object from scope");
        Object object = scope.get(name);
        if (object == null) {
            object = objectFactory.getObject();
            scope.put(name, object);
        }
        return object;
    }

    @Override
    public Object remove(String name) {
        System.out.println("removing object from scope");
        Map<String, Object> scope = myThreadScope.get();
        return scope.remove(name);
    }

    @Override
    public String getConversationId() {
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }
}
