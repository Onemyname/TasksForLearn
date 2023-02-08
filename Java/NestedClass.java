
public class NestedClass {
    Engine engine = new Engine();

    public class Engine {

        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }
    }
}
