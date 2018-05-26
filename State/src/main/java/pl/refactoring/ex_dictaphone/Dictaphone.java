package pl.refactoring.ex_dictaphone;

/*
 * Invented by Wlodek Krakowski
 */
public class Dictaphone {

    private String prevState;
    private String state;
    private Engine engine = new Engine();

    public Dictaphone() {
        this.state = State.OFF;
    }

    public String getState() {
        return state;
    }

    public Engine getEngine() {
        return engine;
    }

    public void play() {
        if (state == State.PLAYING) {
            state = State.FORWARD_PLAY_3x;

            engine.setHead(Engine.HeadState.READING);
            engine.setTapeDirection(Engine.TAPE_FORWARD_3x);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(true);
        } else if (state == State.STOPPED) {
            state = State.PLAYING;

            engine.setHead(Engine.HeadState.READING);
            engine.setTapeDirection(Engine.TAPE_FORWARD);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(true);
        } else if (state == State.FORWARD_PLAY_3x) {
            state = State.PLAYING;

            engine.setHead(Engine.HeadState.READING);
            engine.setTapeDirection(Engine.TAPE_FORWARD);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(true);
        }
    }

    public void power() {

        if (state == State.OFF) {
            state = State.STOPPED;

            engine.setHead(Engine.HeadState.PUT_AWAY);
            engine.setTapeDirection(Engine.TAPE_STOPPED);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(false);
        } else if (state == State.STOPPED) {
            state = State.OFF;

            engine.setHead(Engine.HeadState.PUT_AWAY);
            engine.setTapeDirection(Engine.TAPE_STOPPED);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(false);
        }
    }

    public void record() {
        if (state == State.STOPPED) {
            state = State.RECORDING;

            engine.setHead(Engine.HeadState.WRITING);
            engine.setTapeDirection(Engine.TAPE_FORWARD);
            engine.setMicrophoneOn(true);
            engine.setSpeakersOn(false);
        }
    }

    public void pause() {
        if (state == State.PAUSED) {
            state = prevState;
            engine.setTapeDirection(Engine.TAPE_FORWARD);
        } else if (state == State.PLAYING || state == State.RECORDING) {
            prevState = state;
            state = State.PAUSED;
            engine.setTapeDirection(Engine.TAPE_STOPPED);
        }
    }

    public void fastForward() {
        if (state == State.STOPPED) {
            state = State.FAST_FORWARD;

            engine.setHead(Engine.HeadState.PUT_AWAY);
            engine.setTapeDirection(Engine.TAPE_FAST_FORWARD);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(false);
        } else if (state == State.PLAYING) {
            state = State.FORWARD_PLAY_3x;

            engine.setHead(Engine.HeadState.READING);
            engine.setTapeDirection(Engine.TAPE_FORWARD_3x);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(true);
        }
    }

    public void rewind() {
        if (state == State.STOPPED) {
            state = State.REWIND;

            engine.setHead(Engine.HeadState.PUT_AWAY);
            engine.setTapeDirection(Engine.TAPE_FAST_BACKWARD);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(false);
        } else if (state == State.PLAYING) {
            state = State.BACKWARD_PLAY_3x;

            engine.setHead(Engine.HeadState.READING);
            engine.setTapeDirection(Engine.TAPE_BACKWARD_3x);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(true);
        }
    }

    public void stop() {
        if (state != State.OFF) {
            state = State.STOPPED;

            engine.setHead(Engine.HeadState.PUT_AWAY);
            engine.setTapeDirection(Engine.TAPE_STOPPED);
            engine.setMicrophoneOn(false);
            engine.setSpeakersOn(false);
        }
    }
}
